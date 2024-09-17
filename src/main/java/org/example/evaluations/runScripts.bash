SCRIPT1="./checkCommitsMissingInChanges1Branch.bash"
SCRIPT2="./checkCommitsMissingInChanges2Branch.bash"
SCRIPT3="./checkCommitsMissingInChanges1BranchWrtChanges2.bash"
SCRIPT4="./checkCommitsMissingInChanges2BranchWrtChanges1.bash"

echo "Running $SCRIPT1"
bash "$SCRIPT1"
echo

echo "Running $SCRIPT2"
bash "$SCRIPT2"
echo

echo "Running $SCRIPT3"
bash "$SCRIPT3"
echo

echo "Running $SCRIPT4"
bash "$SCRIPT3"
echo

echo "All scripts executed."
echo
