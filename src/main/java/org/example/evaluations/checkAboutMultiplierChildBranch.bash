BRANCH_A="multiplier_src"
BRANCH_B="multiplier"

# Check if BRANCH_A contains all commits from BRANCH_B
if git rev-list --left-right --count "$BRANCH_B".."$BRANCH_A" | awk '{print $2}' | grep -q '^0$'; then
    echo "$BRANCH_A contains all commits from $BRANCH_B"
else
    echo "Error : $BRANCH_A does not contain all commits from $BRANCH_B"
    exit 1
fi
