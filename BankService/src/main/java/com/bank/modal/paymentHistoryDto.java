//package com.bank.modal;
//
//import java.time.LocalDate;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class PaymentHistoryDto {
//	private int id;
//	private LocalDate paidOn;
//	private long amountPaid;
//	private LocalDate dueDate;
//	private double minimumEmi;
//	
//	 private CreditAccountDto creditAccount;
//}



package com.bank.modal;

import java.io.Serializable;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentHistoryDto implements Serializable {  
    private int id;  
    private LocalDate paidOn;  
    private long amountPaid;  
    private LocalDate dueDate;  
    private double minimumEmi;  
    private CreditAccountDto creditAccount;  
}
