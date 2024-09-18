SCRIPT1="./checkCommitsMissingInChanges1Branch.bash"
SCRIPT2="./checkCommitsMissingInChanges2Branch.bash"
SCRIPT3="./checkCommitsMissingInChanges1BranchWrtChanges2.bash"
SCRIPT4="./checkCommitsMissingInChanges2BranchWrtChanges1.bash"
SCRIPT5="./checkCommitMissingInChanges1.bash"
SCRIPT6="./checkCommitMissingInChanges2.bash"

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
echo
echo "Executing $SCRIPT6..."
if ! bash "$SCRIPT6"; then
    echo "Error: $SCRIPT6 failed"
    exit 1
fi
echo
echo
echo
echo "All scripts executed successfully."
