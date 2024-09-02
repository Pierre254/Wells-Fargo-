@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "financial_advisor_id")
    private FinancialAdvisor financialAdvisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;
}
