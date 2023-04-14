package com.esprit.examen.services;

/*import com.esprit.examen.repositories.CategorieProduitRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CategorieProduitServiceImplTest {
    @Autowired
    public CategorieProduitServiceImpl service;
    @MockBean
    public CategorieProduitRepository repo;
    @Test
    void contextLoads() {
    }
    public void retrieveAllCategorieProduitsTest() {
        CategorieProduit cp = new CategorieProduit(1L,"test", "test",null);
        CategorieProduit cp2 = new CategorieProduit(2L,"test2", "test",null);

        when(repo.findAll()).thenReturn(Stream
        .of(cp,cp2)).collect(Collectors.toList());
        assertEquals(2, service.retrieveAllCategorieProduits().size());
        //.of(new CategorieProduit()) categorieProduitServiceImpl.retrieveAllCategorieProduits();
    }

}*/