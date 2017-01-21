// Generated from Field.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FieldParser}.
 */
public interface FieldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FieldParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(FieldParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(FieldParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(FieldParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(FieldParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FieldParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FieldParser.ValueContext ctx);
}