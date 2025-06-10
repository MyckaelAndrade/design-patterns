package Modificada.FabricaEletronicos.factory;

import Modificada.FabricaEletronicos.celular.*;
import Modificada.FabricaEletronicos.notebook.*;

public class Apple implements Eletronicos {
    @Override
    public Celular criarCelular() {
        return new Iphone("Iphone 14", "Preto", 10000);
    }

    @Override
    public Notebook criarNotebook() {
        return new MacBook("MacBook Pro", "Prata", 20000);
    }
    
}
