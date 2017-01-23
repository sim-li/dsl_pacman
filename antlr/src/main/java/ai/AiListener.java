// Generated from ./src/main/java/ai/Ai.g4 by ANTLR 4.6

    package ai.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AiParser}.
 */
public interface AiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AiParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(AiParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(AiParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(AiParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(AiParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AiParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AiParser.ValueContext ctx);
}