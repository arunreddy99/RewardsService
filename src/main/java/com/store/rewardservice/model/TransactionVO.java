package com.store.rewardservice.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionVO {
    private Long id;
    private String customerId;
    private String purChaseDate;
    private Long purchasePrice;
    private Long rewardsPoint;


}
