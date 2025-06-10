package Modificada.FabricaEletronicos.factory;

import Modificada.FabricaEletronicos.celular.*;
import Modificada.FabricaEletronicos.notebook.*;

public class Samsung implements Eletronicos {
    @Override
    public Celular criarCelular() {
        return new Galaxy("Galaxy S21", "Azul", 5000);
    }

    @Override
    public Notebook criarNotebook() {
        return new GalaxyBook("Galaxy Book Pro", "Cinza", 7000);
    }
    
}
