BRANCH_A="main"
BRANCH_B="multiplier"

# Find the common ancestor
common_ancestor=$(git merge-base "$BRANCH_A" "$BRANCH_B")

# Check if BRANCH_B contains the common ancestor
if git merge-base --is-ancestor "$common_ancestor" "$BRANCH_B"; then
    echo "$BRANCH_B is a descendant of $BRANCH_A"
else
    echo "Error : $BRANCH_B is not a descendant of $BRANCH_A"
    exit 1
fi
