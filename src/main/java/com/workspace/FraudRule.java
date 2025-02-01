package com.workspace;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
