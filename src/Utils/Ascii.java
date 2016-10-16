/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.ArrayList;

/**
 *
 * @author glender
 */
public class Ascii {
	
	public ArrayList<Integer> ascii = new ArrayList<Integer>();
	public ArrayList<Integer> asciiNew = new ArrayList<Integer>();
	
	public enum ascii_lower {
		
		a(97), b(98), c(99), d(100), e(101), f(102), g(103), h(104), i(105), j(106), k(107), l(108), m(109), n(110), o(111), p(112), q(113), r(114), s(115), t(116), u(117), v(118), w(119), x(120), y(121), z(122);
		
		private final int id;
		ascii_lower(int id) { this.id = id; }
		public int getValue() { return id; }
	}
	
	public enum ascii_upper {
		
		A(65), B(66), C(67), D(68), E(69), F(70), G(71), H(72), I(73), J(74), K(75), L(76), M(77), N(78), O(79), P(80), Q(81), R(82), S(83), T(84), U(85), V(86), W(87), X(88), Y(89), Z(90);
		
		private final int id;
		ascii_upper(int id) { this.id = id; }
		public int getValue() { return id; }
	}
	
	public enum ascii_special {
		
		SPACE(32), BANG(33), DOUBLE_QUOTES(34), HASH(35), DOLLAR(36), PERCENT(37), AMPERSAND(38), SINGLE_QUOTE(39), OPEN_PAREN(40), CLOSE_PAREN(41), ASTERISK(42), PLUS(43), COMMA(44), MINUS(45), PERIOD(46), SLASH(47), COLON(58), SEMI_COLON(59), LESS_THAN(60), EQUAL(61), GREATER_THAN(62), QUESTION(63), AT(64), OPEN_BRAC(91), BACKSLASH(92), CLOSE_BRAC(93), CIRCUMFLEX(94), UNDERSCORE(95), GRAVE_ACCENT(96), OPEN_BRACE(123), VERT_BAR(124), CLOSE_BRACE(125), EQUIVALENCY(126), PLUS_MINUS(261);
		
		private final int id;
		ascii_special(int id) { this.id = id; }
		public int getValue() { return id; }
	}
	
	public enum ascii_numbers {
		ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
		
		private final int id;
		ascii_numbers(int id) { this.id = id; }
		public int getValue() { return id; }
	}
	
	public enum ascii_new_line {
		newLine(10);
		
		private final int id;
		ascii_new_line(int id) { this.id = id; }
		public int getValue() { return id; }
	}
	
	Ascii() {
		
		// put the enum values into the arrayList
		for (ascii_lower al : ascii_lower.values()) {
			ascii.add(al.id);
		}
		
		// put the enum values into the arrayList
		for (ascii_upper au : ascii_upper.values()) {
			ascii.add(au.id);
		}
		
		// put the enum values into the arrayList
		for (ascii_special as : ascii_special.values()) {
			ascii.add(as.id);
		}
		
		// put the enum values into the arrayList
		//for (ascii_numbers an : ascii_numbers.values()) {
		//	ascii.add(an.id);
		//}
		
		// put the enum values into the arrayList
		for (ascii_new_line anl : ascii_new_line.values()) {
			asciiNew.add(anl.id);
		}
		
		for (int index = 128; index < 255; index++) {
			ascii.add(index);
		}
		
	}
	
}
