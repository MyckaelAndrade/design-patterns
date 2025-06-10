package Modificada.FabricaEletronicos.factory;

import Modificada.FabricaEletronicos.celular.*;
import Modificada.FabricaEletronicos.notebook.*;

public interface Eletronicos {
    Celular criarCelular();
    Notebook criarNotebook();
}
