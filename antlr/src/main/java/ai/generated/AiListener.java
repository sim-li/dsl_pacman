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
	 * Enter a parse tree produced by {@link AiParser#bracket_open}.
	 * @param ctx the parse tree
	 */
	void enterBracket_open(AiParser.Bracket_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#bracket_open}.
	 * @param ctx the parse tree
	 */
	void exitBracket_open(AiParser.Bracket_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#bracket_close}.
	 * @param ctx the parse tree
	 */
	void enterBracket_close(AiParser.Bracket_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#bracket_close}.
	 * @param ctx the parse tree
	 */
	void exitBracket_close(AiParser.Bracket_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(AiParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(AiParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#block_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_declaration(AiParser.Block_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#block_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_declaration(AiParser.Block_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AiParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link AiParser#else_free_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_free_statement(AiParser.Else_free_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#else_free_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_free_statement(AiParser.Else_free_statementContext ctx);
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
	 * Enter a parse tree produced by {@link AiParser#end_ai}.
	 * @param ctx the parse tree
	 */
	void enterEnd_ai(AiParser.End_aiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#end_ai}.
	 * @param ctx the parse tree
	 */
	void exitEnd_ai(AiParser.End_aiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiParser#direction_statement}.
	 * @param ctx the parse tree
	 */
	void enterDirection_statement(AiParser.Direction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#direction_statement}.
	 * @param ctx the parse tree
	 */
	void exitDirection_statement(AiParser.Direction_statementContext ctx);
}