GRAMMARS=( "Ai" "Level" )
for GRAMMAR in "${GRAMMARS[@]}"
do
    GRAMMAR_JAVA_DIR=$(echo "$GRAMMAR" | tr '[:upper:]' '[:lower:]')
    echo $GRAMMAR_JAVA_DIR
    SOURCE_PATH="./src/main/java/$GRAMMAR_JAVA_DIR"
    antlr4="java -jar /usr/local/lib/antlr-4.6-complete.jar"
    $antlr4 $SOURCE_PATH/$GRAMMAR.g4 -o . -package $GRAMMAR.generated
    FILE_SUFIXES=( "BaseListener.java" "Lexer.java" "Lexer.tokens" "Listener.java" "Parser.java" )
    GENERATED_DIRECTORY="generated"

    for SUFIX in "${FILE_SUFIXES[@]}"
    do
        rm -rf $SOURCE_PATH/$GENERATED_DIRECTORY
        mkdir $SOURCE_PATH/$GENERATED_DIRECTORY
        mv $SOURCE_PATH/${GRAMMAR}$SUFIX $SOURCE_PATH/$GENERATED_DIRECTORY
    done
done
