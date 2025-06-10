package Modificada.FabricaMoveis;

import Modificada.FabricaMoveis.cadeira.*;
import Modificada.FabricaMoveis.factory.*;
import Modificada.FabricaMoveis.mesa.*;

public class MainMoveis {
    public static void main(String[] args) {
        MoveisFactory rustica = new FabricaRustica();
        Cadeira cadeiraRustica = rustica.criarCadeira();
        Mesa mesaRustica = rustica.criarMesa();

        MoveisFactory moderna = new FabricaModerna();
        Cadeira cadeiraModerna = moderna.criarCadeira();
        Mesa mesaModerna = moderna.criarMesa();

        MoveisFactory minimalista = new FabricaMinimalista();
        Cadeira cadeiraMinimalista = minimalista.criarCadeira();
        Mesa mesaMinimalista = minimalista.criarMesa();

        System.out.println("=== Fábrica Rústica ===");
        cadeiraRustica.exibirInfo();
        mesaRustica.exibirInfo();

        System.out.println("\n=== Fábrica Moderna ===");
        cadeiraModerna.exibirInfo();
        mesaModerna.exibirInfo();

        System.out.println("\n=== Fábrica Minimalista ===");
        cadeiraMinimalista.exibirInfo();
        mesaMinimalista.exibirInfo();
    }
}
