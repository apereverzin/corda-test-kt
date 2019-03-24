package com.template.states

import com.template.contracts.IOUContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.ContractState
import net.corda.core.identity.Party

@BelongsToContract(IOUContract::class)
class IOUState(val value: Int,
               val lender: Party,
               val borrower: Party) : ContractState {
    override val participants get() = listOf(lender, borrower)
}
