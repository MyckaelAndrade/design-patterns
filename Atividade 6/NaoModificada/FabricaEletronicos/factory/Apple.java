package NaoModificada.FabricaEletronicos.factory;

import NaoModificada.FabricaEletronicos.celular.*;
import NaoModificada.FabricaEletronicos.notebook.*;

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
