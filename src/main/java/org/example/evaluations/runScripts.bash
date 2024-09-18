SCRIPT1="./checkIfCommitCreatedInDecrementBranch.bash"
SCRIPT2="./checkIfCommitCreatedInIncrementBranch.bash"
SCRIPT3="./checkCommitsInCalculatorBranch.bash"

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
echo "All scripts executed successfully."
