package net.epsi10n.AccontingService.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DepositUpdateComponent {
    @Scheduled(fixedDelay=30000L)
    void updateUserDeposits() {
        // TODO update all users deposits till 207% of initial balance

    }
}
