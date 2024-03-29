package com.lotsofun.farkle;

/**
 * 
 * Enum for DieStates 
 * UNHELD - Available to be rolled 
 * HELD - Not
 * available to be rolled but eligible for scoring selection 
 * SCORED - Not
 * available to be rolled or selected for scoring 
 * DISABED - Prevents die
 * selection
 * 
 * @author Curtis Brown
 * @version 3.0.0
 *
 */
public enum DieState {
	UNHELD, HELD, SCORED, DISABLED
}
