class NonTransactionalProxyableScopedService {
	static scope = "request"
	static proxy = true
	static transactional = false
	def var = 0
}