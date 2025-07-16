def two_sum(nums, target):
    """
    Find indices of the two numbers such that they add up to the target.
    
    Args:
    nums: List[int] - List of integers.
    target: int - Target sum.
    
    Returns:
    List[int] - Indices of the two numbers.
    """
    num_map = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]
        num_map[num] = i
    return []

# Example usage
if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    result = two_sum(nums, target)
    print("Indices:", result)
