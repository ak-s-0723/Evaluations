SCRIPT1="./checkIfCommitCreatedWithCorrectFiles.bash"
SCRIPT2="./checkIfCommitCreatedWithCorrectName.bash"
SCRIPT3="./checkIfUserHasTriedToPushInRemoteBranch.bash"

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
echo "Executing $SCRIPT3..."
if ! bash -i "$SCRIPT3"; then
    echo "Error: $SCRIPT3 failed"
    exit 1
fi
echo
echo "All scripts executed successfully."
