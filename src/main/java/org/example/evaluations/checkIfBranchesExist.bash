REQUIRED_BRANCHES=("divider" "multiplier" "multiplier_src" "multiplier_tst")

local_branches=$(git branch --format '%(refname:short)')

branch_exists() {
    local branch_name=$1
    echo "$local_branches" | grep -w "$branch_name" > /dev/null
}

for branch in "${REQUIRED_BRANCHES[@]}"; do
    if branch_exists "$branch"; then
        echo "Local branch '$branch' exists."
    else
        echo "Error : Local branch '$branch' does not exist."
    fi
done
