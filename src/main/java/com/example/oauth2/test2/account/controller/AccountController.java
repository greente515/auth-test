package com.example.oauth2.test2.account.controller;

//@Slf4j
//@RestController
//@RequiredArgsConstructor
//public class AccountController {
//
//    private final ModelMapper modelMapper;
//
//    /**
//     * Returns {@link AccountEntity} given authorized user or UNAUTHORIZED status if no auth.
//     */
//    @ApiOperation(value = "Getting current user's information")
//    @GetMapping("/accounts/me")
//    public ResponseEntity getAccount(@AuthPrincipal AccountEntity account) {
//        if (account == null) {
//            log.info("/accounts/me is called with anonymous");
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//
//        try {
//            log.info("/accounts/me is called with {}", account.getEmail());
//            return ResponseEntity.ok(modelMapper.map(account, AccountDto.class));
//        } catch (Exception e) {
//            log.warn("Exception occur while serializing account", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//        }
//    }
//}
