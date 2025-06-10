package Modificada.FabricaMoveis.factory;

import Modificada.FabricaMoveis.cadeira.Cadeira;
import Modificada.FabricaMoveis.mesa.Mesa;

public interface MoveisFactory {
    Cadeira criarCadeira();
    Mesa criarMesa();
}