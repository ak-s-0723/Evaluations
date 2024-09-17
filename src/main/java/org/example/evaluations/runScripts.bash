SCRIPT1="./checkIfInsideGitRepo.bash"
SCRIPT2="./checkIfInsideCorrectGitRepo.bash"
SCRIPT3="./checkIfCommitCreatedWithCorrectName.bash"
SCRIPT4="./checkIfCommitCreatedWithCorrectFiles.bash"

echo "Checking if Current Directory is Git Repo or not"
bash "$SCRIPT1"
echo
echo "Checking if you cloned correct Git Repo"
bash "$SCRIPT2"
echo
echo "Checking if you created commit with correct name"
bash "$SCRIPT3"
echo
echo "Checking if you created commit with correct files"
bash "$SCRIPT4"
echo
echo "All Scripts ran"