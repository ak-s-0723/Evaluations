repo_dir=$(basename "$(pwd)")
target_String="Assignment1"

if [[ "$repo_dir" = "$target_String" ]]; then
  echo "You have cloned correct repository. Going Great !!"
else
  echo "Error : You have cloned incorrect repository or you are not inside git repo root folder" >&2
  exit 1
fi
