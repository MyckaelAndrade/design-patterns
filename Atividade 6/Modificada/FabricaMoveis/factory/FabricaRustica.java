package Modificada.FabricaMoveis.factory;

import Modificada.FabricaMoveis.cadeira.*;
import Modificada.FabricaMoveis.mesa.*;

public class FabricaRustica implements MoveisFactory {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraRustica();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaRustica();
    }
}