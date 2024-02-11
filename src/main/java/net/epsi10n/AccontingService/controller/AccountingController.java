package net.epsi10n.AccontingService.controller;

import net.epsi10n.AccontingService.data.dto.TransferResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounting")
public class AccountingController {
    @PostMapping("/transfer/{fromUserId}/{toUserId}/{amount}")
    TransferResult transferFunds(
            @PathVariable("fromUserId") Long fromUserId,
            @PathVariable("toUserId") Long toUserId,
            @PathVariable("amount") String amount
    ) {
        // TODO most important functions
        return null;
    }
}
