org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/oauth/token'
        headers {
            header('Authorization' : 'Basic dGVzdENsaWVudDp0ZXN0U2VjcmV0')
        }
        body 'grant_type=client_credentials&scope=cloud_controller.admin_read_only'
    }
    response {
        status 200
        body("""
           {"access_token":"eyJhbGciOiJSUzI1NiIsImtpZCI6ImtleS0xIiwidHlwIjoiSldUIn0.eyJqdGkiOiJjZDAwYTQ1NWU3MmQ0ZjI4ODk4MjUzZTU2MTFmNDJhZSIsInN1YiI6InVhYS1jbGllbnQiLCJhdXRob3JpdGllcyI6WyJjbG91ZF9jb250cm9sbGVyLmFkbWluX3JlYWRfb25seSJdLCJzY29wZSI6WyJjbG91ZF9jb250cm9sbGVyLmFkbWluX3JlYWRfb25seSJdLCJjbGllbnRfaWQiOiJ1YWEtY2xpZW50IiwiY2lkIjoidWFhLWNsaWVudCIsImF6cCI6InVhYS1jbGllbnQiLCJncmFudF90eXBlIjoiY2xpZW50X2NyZWRlbnRpYWxzIiwicmV2X3NpZyI6IjlmMjVkZWEzIiwiaWF0IjoxNTU0MTk1NzExLCJleHAiOjE1NTQyMzg5MTEsImlzcyI6Imh0dHBzOi8vdWFhLnN5cy5sYWIwMS5wY2YucHcvb2F1dGgvdG9rZW4iLCJ6aWQiOiJ1YWEiLCJhdWQiOlsiY2xvdWRfY29udHJvbGxlciIsInVhYS1jbGllbnQiXX0.CbZcXURQAcdwpRSTKiEb7w7mLMxn7f1jqRSAdWzYfc15JgLTdqWNcyGj6I7ae40e-ioYBYgBiqK7K_47qZhhAAsays7okoxY6Is7nfbpkTaMBCCD9oxpqvTPYQf8U5sbo2khvJ802Girjp1Lbl51RL7SdISrcNt9ICK_Jsu0F5d5_f5OhbcG4CNdiu7mdV6DO3IbMvkNjRlztXKFKKnS_cnWWpAzf2AXj6QvmnkKBUVqdsCpR1cOZJYYNd3xo96PsYq-szbynYEETMCCr_wwdLre649KeOvdhAWRuhvQqvVyqbtVTrXJRhInAxDxCFKiCIWym5iFh4wbg6uPvsa6mw","token_type":"bearer","expires_in":43199,"scope":"cloud_controller.admin_read_only","jti":"cd00a455e72d4f28898253e5611f42ae"}
        """)
        headers {
            header('Content-Type': 'application/json')
        }
    }
}