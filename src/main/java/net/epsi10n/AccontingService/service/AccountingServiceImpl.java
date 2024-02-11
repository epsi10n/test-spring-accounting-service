package net.epsi10n.AccontingService.service;

import net.epsi10n.AccontingService.data.dto.TransferResult;
import net.epsi10n.AccontingService.data.dto.UpdateBalanceResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
@Service
public class AccountingServiceImpl implements AccountingService {
    // we use this map to check if
    private ConcurrentHashMap<Long, BigDecimal> processingUsersMap;

    @Override
    public TransferResult transferFunds(Long fromUserId, Long toUserId, BigDecimal amount) {
        return null;
    }

    @Override
    public UpdateBalanceResult updateBalance(Long userId, BigDecimal amount) {
        return null;
    }

    @Override
    public void checkAndUpdateBalances() {

    }
}
