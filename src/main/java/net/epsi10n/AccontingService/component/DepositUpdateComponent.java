package net.epsi10n.AccontingService.component;

import net.epsi10n.AccontingService.service.AccountingService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DepositUpdateComponent {
    private final AccountingService accountingService;

    public DepositUpdateComponent(AccountingService accountingService) {
        this.accountingService = accountingService;
    }

    @Scheduled(fixedDelay=30000L)
    void updateUserDeposits() {
        accountingService.checkAndUpdateBalances();
    }
}
