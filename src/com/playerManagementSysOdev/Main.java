package com.playerManagementSysOdev;

import com.playerManagementSysOdev.Concrete.*;
import com.playerManagementSysOdev.Entities.Campaign;
import com.playerManagementSysOdev.Entities.Game;
import com.playerManagementSysOdev.Entities.Player;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------Start of Player Management----------------------------");

        Player ulas = new Player(1, "Ulaş", "Müezzinoğlu"
                , LocalDate.of(2000, 3, 6), "11111111111", "martulas5252@gmail.com"
                , "123456", "05445575231");

        PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
        playerManager.add(ulas);
        playerManager.update(ulas);
        playerManager.delete(ulas);
        System.out.println("------------------------End of Player Management----------------------------\n");
        System.out.println("------------------------Start of Game Management----------------------------");
        Game callOfDuty = new Game(1,"Call of Duty",300);
        Game counterStrike = new Game(2,"Counter-Strike",200);
        Game batmanArkhamCity = new Game(3,"Batman Arkham City",350);
        Game[] games = {batmanArkhamCity,counterStrike,callOfDuty};
        GameManager gameManager = new GameManager();
        gameManager.add(callOfDuty);
        gameManager.update(callOfDuty);
        gameManager.delete(callOfDuty);
        System.out.println("------------------------------------");
        gameManager.addMultiple(games);
        System.out.println("------------------------End of Game Management----------------------------\n");
        System.out.println("------------------------Start of Campaign Management----------------------");
        Campaign blackFriday = new Campaign(1,"Kara Cuma",10,LocalDate.of(2021,5,13),LocalDate.of(2022,5,13));
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(blackFriday);
        campaignManager.update(blackFriday);
        campaignManager.delete(blackFriday);
        System.out.println("------------------------End of Campaign Management----------------------\n");
        System.out.println("------------------------Start of CheckOut Management--------------------");
        CheckoutManager checkoutManager = new CheckoutManager();
        checkoutManager.saleGame(callOfDuty,ulas);
        checkoutManager.saleGameWithCampaign(batmanArkhamCity,ulas,blackFriday);
        System.out.println("------------------------End of CheckOut Management--------------------");









    }
}
