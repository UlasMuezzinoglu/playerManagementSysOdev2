package com.playerManagementSysOdev.Concrete;

import com.playerManagementSysOdev.Abstracts.CheckoutManagerService;
import com.playerManagementSysOdev.Entities.Campaign;
import com.playerManagementSysOdev.Entities.Game;
import com.playerManagementSysOdev.Entities.Player;

import java.time.LocalDate;

public class CheckoutManager implements CheckoutManagerService {
    @Override
    public void saleGame(Game game, Player player) {
        System.out.println(player.getFirstName() + " " + player.getLastName() + ": İsimli Oyuncuya," + game.getGameName() + " Adlı Oyun Satıldı.");
    }

    @Override
    public void saleGameWithCampaign(Game game, Player player, Campaign campaign) {

        double finalUnitPrice = game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscountRate() / 100);
        LocalDate start = campaign.getStartDate();
        LocalDate end = campaign.getEndDate();
        LocalDate today = LocalDate.now();

        if (start.getDayOfMonth() <= today.getDayOfMonth() && today.getDayOfMonth() <= end.getDayOfMonth()) {
            System.out.println("Kampanya bitmiştir. " + game.getGameName() + " oyununu mevcut fiyat baz alınacak");


        } else {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ": İsimli Oyuncuya," + game.getGameName() + " Adlı Oyun Satıldı." + campaign.getDiscountRate() + " Oranında İndirim Uygulandı.");

        }


    }
}
