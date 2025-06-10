package Modificada.FabricaMoveis.factory;

import Modificada.FabricaMoveis.cadeira.*;
import Modificada.FabricaMoveis.mesa.*;

public class FabricaMinimalista implements MoveisFactory {
    public Cadeira criarCadeira() {
        return new CadeiraMinimalista();
    }

    public Mesa criarMesa() {
        return new MesaMinimalista();
    }
}
