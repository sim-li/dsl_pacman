// Generated from ./src/main/java/ai/Ai.g4 by ANTLR 4.6
package ai.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AiParser}.
 */
public interface AiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AiParser#ai}.
	 * @param ctx the parse tree
	 */
	void enterAi(AiParser.AiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#ai}.
	 * @param ctx the parse tree
	 */
	void exitAi(AiParser.AiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#startai}.
	 * @param ctx the parse tree
	 */
	void enterStartai(AiParser.StartaiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#startai}.
	 * @param ctx the parse tree
	 */
	void exitStartai(AiParser.StartaiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#ai_body}.
	 * @param ctx the parse tree
	 */
	void enterAi_body(AiParser.Ai_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#ai_body}.
	 * @param ctx the parse tree
	 */
	void exitAi_body(AiParser.Ai_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#if_free_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_free_statement(AiParser.If_free_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#if_free_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_free_statement(AiParser.If_free_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#random_statement}.
	 * @param ctx the parse tree
	 */
	void enterRandom_statement(AiParser.Random_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#random_statement}.
	 * @param ctx the parse tree
	 */
	void exitRandom_statement(AiParser.Random_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#leave_free_statement}.
	 * @param ctx the parse tree
	 */
	void enterLeave_free_statement(AiParser.Leave_free_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#leave_free_statement}.
	 * @param ctx the parse tree
	 */
	void exitLeave_free_statement(AiParser.Leave_free_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#get_nth_free_statement}.
	 * @param ctx the parse tree
	 */
	void enterGet_nth_free_statement(AiParser.Get_nth_free_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#get_nth_free_statement}.
	 * @param ctx the parse tree
	 */
	void exitGet_nth_free_statement(AiParser.Get_nth_free_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#ratio_expr}.
	 * @param ctx the parse tree
	 */
	void enterRatio_expr(AiParser.Ratio_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#ratio_expr}.
	 * @param ctx the parse tree
	 */
	void exitRatio_expr(AiParser.Ratio_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#end_ai}.
	 * @param ctx the parse tree
	 */
	void enterEnd_ai(AiParser.End_aiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#end_ai}.
	 * @param ctx the parse tree
	 */
	void exitEnd_ai(AiParser.End_aiContext ctx);
}