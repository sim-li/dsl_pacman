// Generated from ./src/main/java/level/Level.g4 by ANTLR 4.6
package level.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LevelParser}.
 */
public interface LevelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LevelParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LevelParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LevelParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(LevelParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(LevelParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LevelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LevelParser.ValueContext ctx);
}