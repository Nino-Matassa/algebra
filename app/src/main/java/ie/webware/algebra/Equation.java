package ie.webware.algebra;

// https://physics.info/symbols/
public class Equation {
	String[] p = {"m", "v"}; // momentum = mass*velocity
	String[] m = {Symbol.rho, "v"}; // mass = density*volume
	String[] v = {Symbol.Delta + "x/" + Symbol.Delta + "t"}; // velocity = change in x/change in time
}
