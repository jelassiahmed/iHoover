package View;

import Controller.parserController;
import Controller.MoveController;
import Model.AspiratorModel;
import Model.GridModel;
import Model.enums.MoveEnum;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez inserer les dimensions de la grille exemple : 10 10");
        GridModel grid = parserController.parseGrid(scanner.nextLine());
        System.out.println("Veuillez inserer la position initiale de l'aspirateur exemple: 5 5 N ");
        AspiratorModel pos = parserController.parseAspirator(scanner.nextLine());
        System.out.println("Veuillez inserer la serie des instructions: DADADADAA ");
        List<MoveEnum> instructions = parserController.parseMoves(scanner.nextLine());
        System.out.println(grid);
        System.out.println(pos);
        System.out.println(instructions);
        AspiratorModel aspirator = MoveController.getFinalPosition(grid, pos, instructions);
        System.out.println("position finale : " + aspirator);
    }
}
