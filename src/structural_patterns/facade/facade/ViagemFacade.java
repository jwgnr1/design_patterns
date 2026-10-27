package structural_patterns.facade.facade;


import structural_patterns.facade.model.Cliente;
import structural_patterns.facade.model.Reserva;
import structural_patterns.facade.services.*;

public class ViagemFacade {

    private VooService vooService;
    private HotelService hotelService;
    private TransporteService transporteService;
    private ComprovanteService comprovanteService;
    private NotificacaoService notificacaoService;

    public ViagemFacade(){
        this.vooService = new VooService();
        this.hotelService = new HotelService();
        this.transporteService = new TransporteService();
        this.comprovanteService = new ComprovanteService();
        this.notificacaoService = new NotificacaoService();
    }

    public Reserva reservaViagem(Cliente cliente, String destino){

        System.out.println("===== CHECKOUT RESERVA =====");

        vooService.reservarVoo(destino);
        hotelService.reservarHotel(destino);
        transporteService.reservarTransporte(destino);
        Reserva reserva = comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente, reserva);

        return reserva;

    }
}
