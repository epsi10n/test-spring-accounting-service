package net.epsi10n.AccontingService.component;

import net.epsi10n.AccontingService.service.AccountingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DepositUpdateComponent {
    private final AccountingService accountingService;

    private final Logger LOGGER = LoggerFactory.getLogger("Deposit Update Task");

    public DepositUpdateComponent(AccountingService accountingService) {
        this.accountingService = accountingService;
    }

    @Scheduled(fixedDelay=30000L)
    void updateUserDeposits() {
        LOGGER.info("Updating all available balances by 10% (not further than 207)...");
        accountingService.checkAndUpdateBalances();
        LOGGER.info("Balances update completed");
    }
}
