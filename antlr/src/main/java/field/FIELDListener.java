package field;
// Generated from FIELD.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FIELDParser}.
 */
public interface FIELDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FIELDParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(FIELDParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FIELDParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(FIELDParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FIELDParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(FIELDParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FIELDParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(FIELDParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FIELDParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FIELDParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FIELDParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FIELDParser.ValueContext ctx);
}
