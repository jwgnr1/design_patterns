package structural_patterns.adapter;

import interfaces.PadraoExecutor;
import structural_patterns.adapter.adapters.*;
import structural_patterns.adapter.apis.*;
import structural_patterns.adapter.interfaces.ControleUniversal;

public class AdapterExecutor implements PadraoExecutor {

    public void executar(){

        ControleUniversal samsung = new SamsungAdapter(new TvSamsungApi());
        MiRemoteApp app1 = new MiRemoteApp(samsung);
        app1.iniciar();
        app1.encerrar();

        ControleUniversal lg = new LgAdapter(new TvLgApi());
        MiRemoteApp app2 = new MiRemoteApp(lg);
        app2.iniciar();
        app2.encerrar();;

        ControleUniversal arcond = new ArCondicionadoAdapter(new ArCondicionadoApi());
        MiRemoteApp app3 = new MiRemoteApp(arcond);
        app3.iniciar();
        app3.encerrar();

    }
}
