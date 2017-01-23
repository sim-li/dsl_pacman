GRAMMARS=( "Ai" "Level" )
echo "Processing grammars"
for GRAMMAR in "${GRAMMARS[@]}"
do
    echo ""
    echo "Grammar $GRAMMAR"
    GRAMMAR_JAVA_DIR=$(echo "$GRAMMAR" | tr '[:upper:]' '[:lower:]')
    SOURCE_PATH="./src/main/java/$GRAMMAR_JAVA_DIR"
    echo "Generating files with antlr..."
    antlr4="java -jar /usr/local/lib/antlr-4.6-complete.jar"
    $antlr4 $SOURCE_PATH/$GRAMMAR.g4 -o . -package $GRAMMAR_JAVA_DIR.generated
    FILE_SUFIXES=( "BaseListener.java" "Lexer.java" ".tokens" "Lexer.tokens" "Listener.java" "Parser.java" )
    GENERATED_DIRECTORY="generated"

    rm -rf $SOURCE_PATH/$GENERATED_DIRECTORY
    mkdir $SOURCE_PATH/$GENERATED_DIRECTORY

    echo "Moving files to generated directories"
    for SUFIX in "${FILE_SUFIXES[@]}"
    do
        FILE_SOURCE=$SOURCE_PATH/${GRAMMAR}$SUFIX
        FILE_TARGET=$SOURCE_PATH/$GENERATED_DIRECTORY
        mv $FILE_SOURCE $FILE_TARGET
    done
done
echo ""
echo "Done."
