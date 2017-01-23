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
	 * Enter a parse tree produced by {@link AiParser#start_ai}.
	 * @param ctx the parse tree
	 */
	void enterStart_ai(AiParser.Start_aiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiParser#start_ai}.
	 * @param ctx the parse tree
	 */
	void exitStart_ai(AiParser.Start_aiContext ctx);
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