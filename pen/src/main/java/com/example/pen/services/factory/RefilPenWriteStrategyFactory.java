package com.example.pen.services.factory;

import com.example.pen.enums.RefilType;
import com.example.pen.services.BallPenRefilWriteStrategy;
import com.example.pen.services.GelPenRefilWriteStrategy;
import com.example.pen.services.RefilWriteStrategy;

public class RefilPenWriteStrategyFactory {
    public static RefilWriteStrategy getStrategyForType(RefilType type) {
        if (type.equals(RefilType.BALL)) {
            return new BallPenRefilWriteStrategy();
        } else {
            return new GelPenRefilWriteStrategy();
        }
    }
}
