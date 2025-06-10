package Modificada.FabricaMoveis.factory;

import Modificada.FabricaMoveis.cadeira.*;
import Modificada.FabricaMoveis.mesa.*;

public class FabricaModerna implements MoveisFactory {
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    public Mesa criarMesa() {
        return new MesaModerna();
    }
}
