SCRIPT1="./testIfCommitIsCreatedWithCorrectName.bash"
SCRIPT2="./testIfCommit2IsCreatedWithCorrectName.bash"
SCRIPT3="./testIfFeature1CommitIsMissingInMain.bash"
SCRIPT4="./testIfFeature1ContainsLatestCommitFromMain.bash"
SCRIPT5="./testIfFeature1IsRebased.bash"

echo "Executing $SCRIPT1..."
if ! bash "$SCRIPT1"; then
    echo "Error: $SCRIPT1 failed"
    exit 1
fi
echo
echo
echo "Executing $SCRIPT2..."
if ! bash "$SCRIPT2"; then
    echo "Error: $SCRIPT2 failed"
    exit 1
fi
echo
echo
echo
echo "Executing $SCRIPT3..."
if ! bash "$SCRIPT3"; then
    echo "Error: $SCRIPT3 failed"
    exit 1
fi
echo
echo
echo
echo "Executing $SCRIPT4..."
if ! bash "$SCRIPT4"; then
    echo "Error: $SCRIPT4 failed"
    exit 1
fi
echo
echo
echo
echo "Executing $SCRIPT5..."
if ! bash "$SCRIPT5"; then
    echo "Error: $SCRIPT5 failed"
    exit 1
fi
echo
echo
echo "All scripts executed successfully."
