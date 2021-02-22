package com.example.oauth2.test1.controller;

//@Controller
//@RequestMapping("/client")
//public class ClientController {
//
//    private ClientDetailsServiceImpl clientRegistrationService;
//
//    @Autowired
//    public ClientController(ClientDetailsServiceImpl clientRegistrationService) {
//        this.clientRegistrationService = clientRegistrationService;
//    }
//
//    @GetMapping("/register")
//    public ModelAndView registerPage(ModelAndView mav) {
//        mav.setViewName("client/register");
//        mav.addObject("registry", new ClientDto());
//        return mav;
//    }
//
//    @GetMapping("/dashboard")
//    public ModelAndView dashboard(@ModelAttribute("clientId") String clientId
//            , @ModelAttribute("clientSecret") String clientSecret
//            , ModelAndView mv) {
//        if (!StringUtils.isEmpty(clientId)) {
//            mv.addObject("applications",
//                    clientRegistrationService.loadClientByClientId(clientId));
//            mv.addObject("client_secret", clientSecret);
//        }
//        mv.setViewName("client/dashboard");
//        return mv;
//    }
//
//    @Transactional
//    @PostMapping("/save")
//    public ModelAndView save(@Valid ClientDto clientDetails, ModelAndView mav, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return new ModelAndView("client/register");
//        }
//        String randomId = UUID.randomUUID().toString();
//        String randomSecret = UUID.randomUUID().toString();
//
//        Client client = new Client();
//        client.addAdditionalInformation("name", clientDetails.getName());
//        client.setRegisteredRedirectUri(new HashSet<>(Arrays.asList("http://localhost:9000/callback")));
//        client.setClientType(ClientType.PUBLIC);
//        client.setClientId(randomId);
//        client.setClientSecret(Crypto.sha256(randomSecret));
//        client.setAccessTokenValiditySeconds(3600);
//        client.setScope(Arrays.asList("read", "write"));
//        clientRegistrationService.addClientDetails(client);
//
//        mav.setViewName("redirect:/client/dashboard");
//        mav.addObject("clientId", randomId);
//        mav.addObject("clientSecret", randomSecret);
//
//        return mav;
//    }
//
//    @GetMapping("/remove")
//    public ModelAndView remove(
//            @RequestParam(value = "client_id", required = false) String clientId) {
//
//        clientRegistrationService.removeClientDetails(clientId);
//
//        ModelAndView mv = new ModelAndView("redirect:/client/dashboard");
//        mv.addObject("applications",
//                clientRegistrationService.listClientDetails());
//        return mv;
//    }
//}
