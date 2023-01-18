pub fn test_uniffi(left: u32, right: u32) -> u32 {
    left + right
}

uniffi_macros::include_scaffolding!("math");
