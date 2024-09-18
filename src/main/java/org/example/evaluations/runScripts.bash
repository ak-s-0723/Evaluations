SCRIPT1="./checkCommitsMissingInChanges1Branch.bash"
SCRIPT2="./checkCommitsMissingInChanges2Branch.bash"
SCRIPT3="./checkCommitsMissingInChanges1BranchWrtChanges2.bash"
SCRIPT4="./checkCommitsMissingInChanges2BranchWrtChanges1.bash"
SCRIPT5="./checkCommitMissingInChanges1.bash"
SCRIPT6="./checkCommitMissingInChanges2.bash"

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
bash "$SCRIPT4"
echo

echo "Running $SCRIPT5"
bash "$SCRIPT5"
echo

echo "Running $SCRIPT6"
bash "$SCRIPT6"
echo

echo "All scripts executed."
echo
